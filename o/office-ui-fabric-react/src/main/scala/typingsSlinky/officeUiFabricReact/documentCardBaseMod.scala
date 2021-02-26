package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.documentCardTypesMod.IDocumentCard
import typingsSlinky.officeUiFabricReact.documentCardTypesMod.IDocumentCardProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase")
  @js.native
  class DocumentCardBase protected ()
    extends Component[IDocumentCardProps, js.Any, js.Any]
       with IDocumentCard {
    def this(props: IDocumentCardProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _onAction: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _rootElement: js.Any = js.native
  }
  /* static members */
  object DocumentCardBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase.defaultProps")
    @js.native
    def defaultProps: IDocumentCardProps = js.native
    @scala.inline
    def defaultProps_=(x: IDocumentCardProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
