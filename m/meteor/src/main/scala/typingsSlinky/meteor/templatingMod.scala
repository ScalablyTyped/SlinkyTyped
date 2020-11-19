package typingsSlinky.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/templating", JSImport.Namespace)
@js.native
object templatingMod extends js.Object {
  
  @js.native
  class Template ()
    extends typingsSlinky.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
  }
  @js.native
  object Template
    extends TopLevel[typingsSlinky.meteor.templatingMod.TemplateStatic]
  
  @js.native
  trait TemplateStatic
    extends typingsSlinky.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typingsSlinky.meteor.Blaze.Template] {
    
    var body: typingsSlinky.meteor.Blaze.Template = js.native
  }
}
