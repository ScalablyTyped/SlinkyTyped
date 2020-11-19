package typingsSlinky.angularPdfjsViewer

import typingsSlinky.angular.mod.IServiceProvider
import typingsSlinky.angularPdfjsViewer.angularPdfjsViewerStrings.errors
import typingsSlinky.angularPdfjsViewer.angularPdfjsViewerStrings.infos
import typingsSlinky.angularPdfjsViewer.angularPdfjsViewerStrings.warnings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object pdfjsViewer extends js.Object {
    
    @js.native
    trait ConfigProvider extends IServiceProvider {
      
      def disableWorker(): Unit = js.native
      
      def setCmapDir(dir: String): Unit = js.native
      
      def setImageDir(dir: String): Unit = js.native
      
      @JSName("setVerbosity")
      def setVerbosity_errors(verbosity: errors): Unit = js.native
      @JSName("setVerbosity")
      def setVerbosity_infos(verbosity: infos): Unit = js.native
      @JSName("setVerbosity")
      def setVerbosity_warnings(verbosity: warnings): Unit = js.native
      
      def setWorkerSrc(src: String): Unit = js.native
    }
  }
}
