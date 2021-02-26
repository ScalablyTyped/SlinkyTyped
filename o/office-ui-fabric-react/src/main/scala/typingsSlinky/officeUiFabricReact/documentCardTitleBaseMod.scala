package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTitleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.base", "DocumentCardTitleBase")
  @js.native
  class DocumentCardTitleBase protected ()
    extends Component[IDocumentCardTitleProps, IDocumentCardTitleState, js.Any] {
    def this(props: IDocumentCardTitleProps) = this()
    
    var _async: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _measureTitleElement: js.Any = js.native
    
    var _shrinkTitle: js.Any = js.native
    
    var _titleElement: js.Any = js.native
    
    var _titleTruncationTimer: js.Any = js.native
    
    var _truncateTitle: js.Any = js.native
    
    var _truncateWhenInAnimation: js.Any = js.native
    
    var _updateTruncation: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDocumentCardTitleBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDocumentCardTitleBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDocumentCardTitleBase(): Unit = js.native
  }
  
  @js.native
  trait IDocumentCardTitleState extends StObject {
    
    var clientWidth: js.UndefOr[Double] = js.native
    
    /**
      * In measuring, it will render a same style text with whiteSpace: 'nowrap', to get overflow rate.
      * So that the logic can predict truncated text well.
      */
    var needMeasurement: Boolean = js.native
    
    var previousTitle: String = js.native
    
    var truncatedTitleFirstPiece: js.UndefOr[String] = js.native
    
    var truncatedTitleSecondPiece: js.UndefOr[String] = js.native
  }
  object IDocumentCardTitleState {
    
    @scala.inline
    def apply(needMeasurement: Boolean, previousTitle: String): IDocumentCardTitleState = {
      val __obj = js.Dynamic.literal(needMeasurement = needMeasurement.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleState]
    }
    
    @scala.inline
    implicit class IDocumentCardTitleStateMutableBuilder[Self <: IDocumentCardTitleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
      
      @scala.inline
      def setNeedMeasurement(value: Boolean): Self = StObject.set(x, "needMeasurement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTitle(value: String): Self = StObject.set(x, "previousTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedTitleFirstPiece(value: String): Self = StObject.set(x, "truncatedTitleFirstPiece", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedTitleFirstPieceUndefined: Self = StObject.set(x, "truncatedTitleFirstPiece", js.undefined)
      
      @scala.inline
      def setTruncatedTitleSecondPiece(value: String): Self = StObject.set(x, "truncatedTitleSecondPiece", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedTitleSecondPieceUndefined: Self = StObject.set(x, "truncatedTitleSecondPiece", js.undefined)
    }
  }
}
