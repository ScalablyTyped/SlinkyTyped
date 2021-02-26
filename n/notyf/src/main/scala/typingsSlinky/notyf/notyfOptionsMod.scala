package typingsSlinky.notyf

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.notyf.anon.DeepPartialINotyfNotifica
import typingsSlinky.notyf.notyfBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notyfOptionsMod {
  
  @JSImport("notyf/notyf.options", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @js.native
  sealed trait NotyfEvent extends StObject
  @JSImport("notyf/notyf.options", "NotyfEvent")
  @js.native
  object NotyfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotyfEvent with String] = js.native
    
    @js.native
    sealed trait Click extends NotyfEvent
    /* "click" */ val Click: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Click with String = js.native
    
    @js.native
    sealed trait Dismiss extends NotyfEvent
    /* "dismiss" */ val Dismiss: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Dismiss with String = js.native
  }
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias notyf.notyf/notyf.options.DeepPartial<T[P]> * / object}
    */ typingsSlinky.notyf.notyfStrings.DeepPartial with TopLevel[js.Any]
  
  @js.native
  trait INotyfIcon extends StObject {
    
    var className: String = js.native
    
    var color: String = js.native
    
    var tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any = js.native
    
    var text: String = js.native
  }
  object INotyfIcon {
    
    @scala.inline
    def apply(
      className: String,
      color: String,
      tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any,
      text: String
    ): INotyfIcon = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfIcon]
    }
    
    @scala.inline
    implicit class INotyfIconMutableBuilder[Self <: INotyfIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(
        value: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait INotyfNotificationOptions extends StObject {
    
    var background: String = js.native
    
    /**
      * @deprecated Use `background` instead. Removal target: v4.0.0.
      */
    var backgroundColor: String = js.native
    
    var className: String = js.native
    
    var dismissible: Boolean = js.native
    
    var duration: Double = js.native
    
    var icon: INotyfIcon | `false` = js.native
    
    var message: String = js.native
    
    var position: INotyfPosition = js.native
    
    var ripple: Boolean = js.native
    
    var `type`: String = js.native
  }
  object INotyfNotificationOptions {
    
    @scala.inline
    def apply(
      background: String,
      backgroundColor: String,
      className: String,
      dismissible: Boolean,
      duration: Double,
      icon: INotyfIcon | `false`,
      message: String,
      position: INotyfPosition,
      ripple: Boolean,
      `type`: String
    ): INotyfNotificationOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfNotificationOptions]
    }
    
    @scala.inline
    implicit class INotyfNotificationOptionsMutableBuilder[Self <: INotyfNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: INotyfIcon | `false`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: INotyfPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait INotyfOptions extends StObject {
    
    var dismissible: Boolean = js.native
    
    var duration: Double = js.native
    
    var position: INotyfPosition = js.native
    
    var ripple: Boolean = js.native
    
    var types: js.Array[DeepPartialINotyfNotifica] = js.native
  }
  object INotyfOptions {
    
    @scala.inline
    def apply(
      dismissible: Boolean,
      duration: Double,
      position: INotyfPosition,
      ripple: Boolean,
      types: js.Array[DeepPartialINotyfNotifica]
    ): INotyfOptions = {
      val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfOptions]
    }
    
    @scala.inline
    implicit class INotyfOptionsMutableBuilder[Self <: INotyfOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: INotyfPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: DeepPartialINotyfNotifica*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait INotyfPosition extends StObject {
    
    var x: NotyfHorizontalPosition = js.native
    
    var y: NotyfVerticalPosition = js.native
  }
  object INotyfPosition {
    
    @scala.inline
    def apply(x: NotyfHorizontalPosition, y: NotyfVerticalPosition): INotyfPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotyfPosition]
    }
    
    @scala.inline
    implicit class INotyfPositionMutableBuilder[Self <: INotyfPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: NotyfHorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: NotyfVerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.notyf.notyfStrings.left
    - typingsSlinky.notyf.notyfStrings.center
    - typingsSlinky.notyf.notyfStrings.right
  */
  trait NotyfHorizontalPosition extends StObject
  object NotyfHorizontalPosition {
    
    @scala.inline
    def center: typingsSlinky.notyf.notyfStrings.center = "center".asInstanceOf[typingsSlinky.notyf.notyfStrings.center]
    
    @scala.inline
    def left: typingsSlinky.notyf.notyfStrings.left = "left".asInstanceOf[typingsSlinky.notyf.notyfStrings.left]
    
    @scala.inline
    def right: typingsSlinky.notyf.notyfStrings.right = "right".asInstanceOf[typingsSlinky.notyf.notyfStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.notyf.notyfStrings.top
    - typingsSlinky.notyf.notyfStrings.center
    - typingsSlinky.notyf.notyfStrings.bottom
  */
  trait NotyfVerticalPosition extends StObject
  object NotyfVerticalPosition {
    
    @scala.inline
    def bottom: typingsSlinky.notyf.notyfStrings.bottom = "bottom".asInstanceOf[typingsSlinky.notyf.notyfStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.notyf.notyfStrings.center = "center".asInstanceOf[typingsSlinky.notyf.notyfStrings.center]
    
    @scala.inline
    def top: typingsSlinky.notyf.notyfStrings.top = "top".asInstanceOf[typingsSlinky.notyf.notyfStrings.top]
  }
}
