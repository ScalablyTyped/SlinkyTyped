package typingsSlinky.openfin

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object GoldenLayout extends js.Object {
    
    @js.native
    class GoldenLayout protected ()
      extends typingsSlinky.openfin.GoldenLayout.GoldenLayout {
      /**
        * @param config A GoldenLayout configuration object
        * @param container The DOM element the layout will be initialised in. Default: document.body
        */
      def this(configuration: Config) = this()
      def this(configuration: Config, container: JQuery[HTMLElement]) = this()
      def this(configuration: Config, container: Element) = this()
      def this(configuration: Config, container: HTMLElement) = this()
    }
    /* static members */
    @js.native
    object GoldenLayout extends js.Object {
      
      /**
        * Static method on the GoldenLayout constructor! This method will iterate through a GoldenLayout config object
        * and replace frequent keys and values with single letter substitutes.
        * @param config A GoldenLayout configuration object
        */
      def minifyConfig(config: js.Any): js.Any = js.native
      
      /**
        * Static method on the GoldenLayout constructor! This method will reverse the minifications of minifyConfig.
        * @param minifiedConfig A minified GoldenLayout configuration object
        */
      def unminifyConfig(minifiedConfig: js.Any): js.Any = js.native
    }
  }
}
