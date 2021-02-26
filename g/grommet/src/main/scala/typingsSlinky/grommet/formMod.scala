package typingsSlinky.grommet

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.grommet.anon.Errors
import typingsSlinky.grommet.anon.Invalid
import typingsSlinky.grommet.grommetStrings.blur
import typingsSlinky.grommet.grommetStrings.onChange
import typingsSlinky.grommet.grommetStrings.onSubmit
import typingsSlinky.grommet.grommetStrings.submit
import typingsSlinky.react.mod.BaseSyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Form", "Form")
  @js.native
  class Form protected ()
    extends Component[
          FormProps[_] with (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: FormProps[_] with (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ])) = this()
    def this(
      props: FormProps[_] with (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Form", "Form")
  @js.native
  val Form: ReactComponentClass[
    FormProps[js.Any] with (Omit[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      onChange | onSubmit
    ])
  ] = js.native
  
  @js.native
  trait FormExtendedEvent[R, T] extends BaseSyntheticEvent[Event, EventTarget with T, EventTarget] {
    
    var touched: Record[String, Boolean] = js.native
    
    var value: R = js.native
  }
  object FormExtendedEvent {
    
    @scala.inline
    def apply[R, T](
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget with T,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      touched: Record[String, Boolean],
      `type`: String,
      value: R
    ): FormExtendedEvent[R, T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormExtendedEvent[R, T]]
    }
    
    @scala.inline
    implicit class FormExtendedEventMutableBuilder[Self <: FormExtendedEvent[_, _], R, T] (val x: Self with (FormExtendedEvent[R, T])) extends AnyVal {
      
      @scala.inline
      def setTouched(value: Record[String, Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormProps[T] extends StObject {
    
    var errors: js.UndefOr[js.Object] = js.native
    
    var infos: js.UndefOr[js.Object] = js.native
    
    var messages: js.UndefOr[Invalid] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], _]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ FormExtendedEvent[T, Element], Unit]] = js.native
    
    var onValidate: js.UndefOr[js.Function1[/* validationResults */ Errors, Unit]] = js.native
    
    var validate: js.UndefOr[blur | submit] = js.native
    
    var value: js.UndefOr[js.Object] = js.native
  }
  object FormProps {
    
    @scala.inline
    def apply[T](): FormProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps[T]]
    }
    
    @scala.inline
    implicit class FormPropsMutableBuilder[Self <: FormProps[_], T] (val x: Self with FormProps[T]) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Object): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setInfos(value: js.Object): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
      
      @scala.inline
      def setMessages(value: Invalid): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: /* event */ SyntheticEvent[Event, Element] => _): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* event */ FormExtendedEvent[T, Element] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnValidate(value: /* validationResults */ Errors => Unit): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      @scala.inline
      def setValidate(value: blur | submit): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TypedForm[T] = ReactComponentClass[
    FormProps[T] with (Omit[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      onChange | onSubmit
    ])
  ]
}
