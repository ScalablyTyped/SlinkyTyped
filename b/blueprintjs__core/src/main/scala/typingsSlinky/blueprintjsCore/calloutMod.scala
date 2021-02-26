package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calloutMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/callout/callout", "Callout")
  @js.native
  class Callout protected ()
    extends AbstractPureComponent2[ICalloutProps, js.Object, js.Object] {
    def this(props: ICalloutProps) = this()
    def this(props: ICalloutProps, context: js.Any) = this()
    
    var getIconName: js.Any = js.native
  }
  /* static members */
  object Callout {
    
    @JSImport("@blueprintjs/core/lib/esm/components/callout/callout", "Callout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/callout/callout", "Callout.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait ICalloutProps
    extends HTMLAttributes[HTMLDivElement]
       with IIntentProps {
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render on the left side.
      *
      * If this prop is omitted or `undefined`, the `intent` prop will determine a default icon.
      * If this prop is explicitly `null`, no icon will be displayed (regardless of `intent`).
      */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
  }
  object ICalloutProps {
    
    @scala.inline
    def apply(): ICalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutProps]
    }
    
    @scala.inline
    implicit class ICalloutPropsMutableBuilder[Self <: ICalloutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
}
