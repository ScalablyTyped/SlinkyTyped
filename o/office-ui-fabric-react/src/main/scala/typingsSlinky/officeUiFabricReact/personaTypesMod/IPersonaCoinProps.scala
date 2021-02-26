package typingsSlinky.officeUiFabricReact.personaTypesMod

import slinky.core.facade.ReactRef
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaCoinProps extends IPersonaSharedProps {
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, IPersonaCoinStyles]] = js.native
}
object IPersonaCoinProps {
  
  @scala.inline
  def apply(): IPersonaCoinProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaCoinProps]
  }
  
  @scala.inline
  implicit class IPersonaCoinPropsMutableBuilder[Self <: IPersonaCoinProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IPersonaCoinStyleProps, IPersonaCoinStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IPersonaCoinStyleProps => DeepPartial[IPersonaCoinStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
