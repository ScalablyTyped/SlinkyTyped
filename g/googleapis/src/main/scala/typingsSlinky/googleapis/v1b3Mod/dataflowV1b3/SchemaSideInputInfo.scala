package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a side input of a DoFn or an input of a SeqDoFn.
  */
@js.native
trait SchemaSideInputInfo extends js.Object {
  /**
    * How to interpret the source element(s) as a side input value.
    */
  var kind: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The source(s) to read element(s) from to get the value of this side
    * input. If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters. At least one source is
    * required.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  /**
    * The id of the tag the user code will access this side input by; this
    * should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaSideInputInfo {
  @scala.inline
  def apply(): SchemaSideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSideInputInfo]
  }
  @scala.inline
  implicit class SchemaSideInputInfoOps[Self <: SchemaSideInputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: StringDictionary[js.Any]): Self = {
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
    def withSources(value: js.Array[SchemaSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

