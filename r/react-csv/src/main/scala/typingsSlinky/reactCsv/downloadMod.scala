package typingsSlinky.reactCsv

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactCsv.commonPropTypesMod.CommonPropTypes
import typingsSlinky.reactCsv.commonPropTypesMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod {
  
  @JSImport("react-csv/components/Download", JSImport.Default)
  @js.native
  class default ()
    extends Component[DownloadPropTypes, js.Object, js.Any]
  
  type Download = ReactComponentClass[DownloadPropTypes]
  
  @js.native
  trait DownloadPropTypes extends CommonPropTypes {
    
    var target: js.UndefOr[String] = js.native
  }
  object DownloadPropTypes {
    
    @scala.inline
    def apply(data: String | Data): DownloadPropTypes = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadPropTypes]
    }
    
    @scala.inline
    implicit class DownloadPropTypesMutableBuilder[Self <: DownloadPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
