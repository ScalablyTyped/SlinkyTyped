package typingsSlinky.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatingMod {
  
  @JSImport("meteor/templating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("meteor/templating", "Template")
  @js.native
  class Template ()
    extends typingsSlinky.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: js.UndefOr[scala.Nothing], renderFunction: js.Function) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
  }
  @JSImport("meteor/templating", "Template")
  @js.native
  def Template: typingsSlinky.meteor.templatingMod.TemplateStatic = js.native
  @scala.inline
  def Template_=(x: typingsSlinky.meteor.templatingMod.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TemplateStatic
    extends typingsSlinky.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typingsSlinky.meteor.Blaze.Template] {
    
    var body: typingsSlinky.meteor.Blaze.Template = js.native
  }
}
