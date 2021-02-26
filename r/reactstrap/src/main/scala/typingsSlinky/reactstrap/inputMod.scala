package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapStrings.lg
import typingsSlinky.reactstrap.reactstrapStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("reactstrap/lib/Input", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputProps, js.Object, js.Any]
  
  type Input = ReactComponentClass[InputProps]
  
  @js.native
  trait InputProps
    extends InputHTMLAttributes[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var addon: js.UndefOr[Boolean] = js.native
    
    var bsSize: js.UndefOr[lg | sm] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    var invalid: js.UndefOr[Boolean] = js.native
    
    var plaintext: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
    
    @JSName("type")
    var type_InputProps: js.UndefOr[InputType] = js.native
    
    var valid: js.UndefOr[Boolean] = js.native
  }
  object InputProps {
    
    @scala.inline
    def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddon(value: Boolean): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      @scala.inline
      def setBsSize(value: lg | sm): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLInputElement | HTMLTextAreaElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: InputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactstrap.reactstrapStrings.text
    - typingsSlinky.reactstrap.reactstrapStrings.email
    - typingsSlinky.reactstrap.reactstrapStrings.select
    - typingsSlinky.reactstrap.reactstrapStrings.file
    - typingsSlinky.reactstrap.reactstrapStrings.radio
    - typingsSlinky.reactstrap.reactstrapStrings.checkbox
    - typingsSlinky.reactstrap.reactstrapStrings.textarea
    - typingsSlinky.reactstrap.reactstrapStrings.button
    - typingsSlinky.reactstrap.reactstrapStrings.reset
    - typingsSlinky.reactstrap.reactstrapStrings.submit
    - typingsSlinky.reactstrap.reactstrapStrings.date
    - typingsSlinky.reactstrap.reactstrapStrings.`datetime-local`
    - typingsSlinky.reactstrap.reactstrapStrings.hidden
    - typingsSlinky.reactstrap.reactstrapStrings.image
    - typingsSlinky.reactstrap.reactstrapStrings.month
    - typingsSlinky.reactstrap.reactstrapStrings.number
    - typingsSlinky.reactstrap.reactstrapStrings.range
    - typingsSlinky.reactstrap.reactstrapStrings.search
    - typingsSlinky.reactstrap.reactstrapStrings.tel
    - typingsSlinky.reactstrap.reactstrapStrings.url
    - typingsSlinky.reactstrap.reactstrapStrings.week
    - typingsSlinky.reactstrap.reactstrapStrings.password
    - typingsSlinky.reactstrap.reactstrapStrings.datetime
    - typingsSlinky.reactstrap.reactstrapStrings.time
    - typingsSlinky.reactstrap.reactstrapStrings.color
  */
  trait InputType extends StObject
  object InputType {
    
    @scala.inline
    def button: typingsSlinky.reactstrap.reactstrapStrings.button = "button".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.button]
    
    @scala.inline
    def checkbox: typingsSlinky.reactstrap.reactstrapStrings.checkbox = "checkbox".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.checkbox]
    
    @scala.inline
    def color: typingsSlinky.reactstrap.reactstrapStrings.color = "color".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.color]
    
    @scala.inline
    def date: typingsSlinky.reactstrap.reactstrapStrings.date = "date".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.date]
    
    @scala.inline
    def datetime: typingsSlinky.reactstrap.reactstrapStrings.datetime = "datetime".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.datetime]
    
    @scala.inline
    def `datetime-local`: typingsSlinky.reactstrap.reactstrapStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.`datetime-local`]
    
    @scala.inline
    def email: typingsSlinky.reactstrap.reactstrapStrings.email = "email".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.email]
    
    @scala.inline
    def file: typingsSlinky.reactstrap.reactstrapStrings.file = "file".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.file]
    
    @scala.inline
    def hidden: typingsSlinky.reactstrap.reactstrapStrings.hidden = "hidden".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.hidden]
    
    @scala.inline
    def image: typingsSlinky.reactstrap.reactstrapStrings.image = "image".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.image]
    
    @scala.inline
    def month: typingsSlinky.reactstrap.reactstrapStrings.month = "month".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.month]
    
    @scala.inline
    def number: typingsSlinky.reactstrap.reactstrapStrings.number = "number".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.number]
    
    @scala.inline
    def password: typingsSlinky.reactstrap.reactstrapStrings.password = "password".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.password]
    
    @scala.inline
    def radio: typingsSlinky.reactstrap.reactstrapStrings.radio = "radio".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.radio]
    
    @scala.inline
    def range: typingsSlinky.reactstrap.reactstrapStrings.range = "range".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.range]
    
    @scala.inline
    def reset: typingsSlinky.reactstrap.reactstrapStrings.reset = "reset".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.reset]
    
    @scala.inline
    def search: typingsSlinky.reactstrap.reactstrapStrings.search = "search".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.search]
    
    @scala.inline
    def select: typingsSlinky.reactstrap.reactstrapStrings.select = "select".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.select]
    
    @scala.inline
    def submit: typingsSlinky.reactstrap.reactstrapStrings.submit = "submit".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.submit]
    
    @scala.inline
    def tel: typingsSlinky.reactstrap.reactstrapStrings.tel = "tel".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.tel]
    
    @scala.inline
    def text: typingsSlinky.reactstrap.reactstrapStrings.text = "text".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.text]
    
    @scala.inline
    def textarea: typingsSlinky.reactstrap.reactstrapStrings.textarea = "textarea".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.textarea]
    
    @scala.inline
    def time: typingsSlinky.reactstrap.reactstrapStrings.time = "time".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.time]
    
    @scala.inline
    def url: typingsSlinky.reactstrap.reactstrapStrings.url = "url".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.url]
    
    @scala.inline
    def week: typingsSlinky.reactstrap.reactstrapStrings.week = "week".asInstanceOf[typingsSlinky.reactstrap.reactstrapStrings.week]
  }
}
