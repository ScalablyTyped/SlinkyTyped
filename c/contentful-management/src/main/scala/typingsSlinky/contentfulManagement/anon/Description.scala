package typingsSlinky.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends StObject {
  
  /** Description for this asset */
  var description: StringDictionary[String] = js.native
  
  /** File object for this asset */
  var file: StringDictionary[ContentType] = js.native
  
  /** Title for this asset */
  var title: StringDictionary[String] = js.native
}
object Description {
  
  @scala.inline
  def apply(
    description: StringDictionary[String],
    file: StringDictionary[ContentType],
    title: StringDictionary[String]
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StringDictionary[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: StringDictionary[ContentType]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: StringDictionary[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
