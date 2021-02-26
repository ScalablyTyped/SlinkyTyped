package typingsSlinky.gatsbyCli.anon

import typingsSlinky.gatsbyCli.gatsbyCliStrings.SYSTEM
import typingsSlinky.gatsbyCli.gatsbyCliStrings.THIRD_PARTY
import typingsSlinky.gatsbyCli.gatsbyCliStrings.USER
import typingsSlinky.gatsbyCli.structuredErrorsTypesMod.IStructuredStackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activitytotal extends StObject {
  
  var activity_current: js.UndefOr[Double] = js.native
  
  var activity_total: js.UndefOr[Double] = js.native
  
  var activity_type: js.UndefOr[String] = js.native
  
  var activity_uuid: js.UndefOr[String] = js.native
  
  var category: js.UndefOr[USER | SYSTEM | THIRD_PARTY] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var docsUrl: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var filePath: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var level: String = js.native
  
  var location: js.UndefOr[End] = js.native
  
  var pluginName: js.UndefOr[String] = js.native
  
  var stack: js.UndefOr[js.Array[IStructuredStackFrame]] = js.native
  
  var statusText: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Activitytotal {
  
  @scala.inline
  def apply(level: String): Activitytotal = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activitytotal]
  }
  
  @scala.inline
  implicit class ActivitytotalMutableBuilder[Self <: Activitytotal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity_current(value: Double): Self = StObject.set(x, "activity_current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_currentUndefined: Self = StObject.set(x, "activity_current", js.undefined)
    
    @scala.inline
    def setActivity_total(value: Double): Self = StObject.set(x, "activity_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_totalUndefined: Self = StObject.set(x, "activity_total", js.undefined)
    
    @scala.inline
    def setActivity_type(value: String): Self = StObject.set(x, "activity_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_typeUndefined: Self = StObject.set(x, "activity_type", js.undefined)
    
    @scala.inline
    def setActivity_uuid(value: String): Self = StObject.set(x, "activity_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_uuidUndefined: Self = StObject.set(x, "activity_uuid", js.undefined)
    
    @scala.inline
    def setCategory(value: USER | SYSTEM | THIRD_PARTY): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: End): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    @scala.inline
    def setStack(value: js.Array[IStructuredStackFrame]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStackVarargs(value: IStructuredStackFrame*): Self = StObject.set(x, "stack", js.Array(value :_*))
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
