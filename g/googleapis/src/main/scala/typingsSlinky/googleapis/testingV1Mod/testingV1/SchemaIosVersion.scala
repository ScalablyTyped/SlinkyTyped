package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iOS version.
  */
@js.native
trait SchemaIosVersion extends js.Object {
  
  /**
    * An opaque id for this iOS version. Use this id to invoke the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * An integer representing the major iOS version. Examples: &quot;8&quot;,
    * &quot;9&quot;.
    */
  var majorVersion: js.UndefOr[Double] = js.native
  
  /**
    * An integer representing the minor iOS version. Examples: &quot;1&quot;,
    * &quot;2&quot;.
    */
  var minorVersion: js.UndefOr[Double] = js.native
  
  /**
    * The available Xcode versions for this version.
    */
  var supportedXcodeVersionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaIosVersion {
  
  @scala.inline
  def apply(): SchemaIosVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosVersion]
  }
  
  @scala.inline
  implicit class SchemaIosVersionOps[Self <: SchemaIosVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorVersion: Self = this.set("majorVersion", js.undefined)
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorVersion: Self = this.set("minorVersion", js.undefined)
    
    @scala.inline
    def setSupportedXcodeVersionIdsVarargs(value: String*): Self = this.set("supportedXcodeVersionIds", js.Array(value :_*))
    
    @scala.inline
    def setSupportedXcodeVersionIds(value: js.Array[String]): Self = this.set("supportedXcodeVersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedXcodeVersionIds: Self = this.set("supportedXcodeVersionIds", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
