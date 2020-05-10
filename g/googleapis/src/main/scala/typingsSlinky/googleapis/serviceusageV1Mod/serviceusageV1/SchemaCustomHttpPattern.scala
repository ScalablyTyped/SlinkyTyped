package typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom pattern is used for defining custom HTTP verb.
  */
@js.native
trait SchemaCustomHttpPattern extends js.Object {
  /**
    * The name of this custom HTTP verb.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The path matched by this custom verb.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaCustomHttpPattern {
  @scala.inline
  def apply(): SchemaCustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomHttpPattern]
  }
  @scala.inline
  implicit class SchemaCustomHttpPatternOps[Self <: SchemaCustomHttpPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

