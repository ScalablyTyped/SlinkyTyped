package typingsSlinky.reactSignatureCanvas

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.react.mod.CanvasHTMLAttributes
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  class default () extends ReactSignatureCanvas
  
  @js.native
  trait ReactSignatureCanvas
    extends Component[ReactSignatureCanvasProps, js.Object, js.Any] {
    
    var clear: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['clear'] */ js.Any = js.native
    
    var fromData: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['fromData'] */ js.Any = js.native
    
    var fromDataURL: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['fromDataURL'] */ js.Any = js.native
    
    def getCanvas(): HTMLCanvasElement = js.native
    
    def getSignaturePad(): js.Any = js.native
    
    def getTrimmedCanvas(): HTMLCanvasElement = js.native
    
    var isEmpty: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['isEmpty'] */ js.Any = js.native
    
    var off: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['off'] */ js.Any = js.native
    
    var on: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['on'] */ js.Any = js.native
    
    var toData: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['toData'] */ js.Any = js.native
    
    var toDataURL: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['toDataURL'] */ js.Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad.SignaturePadOptions * / any */ @js.native
  trait ReactSignatureCanvasProps extends StObject {
    
    var canvasProps: js.UndefOr[CanvasHTMLAttributes[HTMLCanvasElement]] = js.native
    
    var clearOnResize: js.UndefOr[Boolean] = js.native
  }
  object ReactSignatureCanvasProps {
    
    @scala.inline
    def apply(): ReactSignatureCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactSignatureCanvasProps]
    }
    
    @scala.inline
    implicit class ReactSignatureCanvasPropsMutableBuilder[Self <: ReactSignatureCanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): Self = StObject.set(x, "canvasProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasPropsUndefined: Self = StObject.set(x, "canvasProps", js.undefined)
      
      @scala.inline
      def setClearOnResize(value: Boolean): Self = StObject.set(x, "clearOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnResizeUndefined: Self = StObject.set(x, "clearOnResize", js.undefined)
    }
  }
}
