package typingsSlinky.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.meteor.Blaze.EventsMap
import typingsSlinky.meteor.Blaze.HelpersMap
import typingsSlinky.meteor.Blaze.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/templating", JSImport.Namespace)
@js.native
object templatingMod extends js.Object {
  @js.native
  class Template ()
    extends typingsSlinky.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    /* CompleteClass */
    @JSName("$")
    override var $: js.Any = js.native
    /* CompleteClass */
    override var created: js.Function = js.native
    /* CompleteClass */
    override var destroyed: js.Function = js.native
    /* CompleteClass */
    override var head: typingsSlinky.meteor.Blaze.Template = js.native
    /* CompleteClass */
    override var renderFunction: js.Function = js.native
    /* CompleteClass */
    override var rendered: js.Function = js.native
    /* CompleteClass */
    override var viewName: String = js.native
    /* CompleteClass */
    override def constructView(): View = js.native
    /* CompleteClass */
    override def events(eventsMap: EventsMap): Unit = js.native
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    /* CompleteClass */
    override def onCreated(cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def onDestroyed(cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def onRendered(cb: js.Function): Unit = js.native
  }
  
  @js.native
  trait TemplateStatic
    extends typingsSlinky.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typingsSlinky.meteor.Blaze.Template] {
    var body: typingsSlinky.meteor.Blaze.Template = js.native
  }
  
  @js.native
  object Template
    extends TopLevel[typingsSlinky.meteor.templatingMod.TemplateStatic]
  
}

