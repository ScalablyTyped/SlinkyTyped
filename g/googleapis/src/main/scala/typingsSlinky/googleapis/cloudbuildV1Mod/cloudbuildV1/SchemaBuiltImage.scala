package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image built by the pipeline.
  */
@js.native
trait SchemaBuiltImage extends js.Object {
  /**
    * Docker Registry 2.0 digest.
    */
  var digest: js.UndefOr[String] = js.native
  /**
    * Name used to push the container image to Google Container Registry, as
    * presented to `docker push`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for pushing the specified image.
    */
  var pushTiming: js.UndefOr[SchemaTimeSpan] = js.native
}

object SchemaBuiltImage {
  @scala.inline
  def apply(): SchemaBuiltImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuiltImage]
  }
  @scala.inline
  implicit class SchemaBuiltImageOps[Self <: SchemaBuiltImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPushTiming(value: SchemaTimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTiming")(js.undefined)
        ret
    }
  }
  
}

