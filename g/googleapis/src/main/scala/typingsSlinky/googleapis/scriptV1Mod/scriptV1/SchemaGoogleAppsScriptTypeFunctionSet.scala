package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of functions. No duplicates are permitted.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunctionSet extends js.Object {
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeFunction]] = js.native
}

object SchemaGoogleAppsScriptTypeFunctionSet {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunctionSet]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionSetOps[Self <: SchemaGoogleAppsScriptTypeFunctionSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[SchemaGoogleAppsScriptTypeFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

