package typingsSlinky.reactReduxI18n

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactType
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper methods
    */
  @js.native
  trait I18n extends StObject {
    
    def l(timestamp: Double): String = js.native
    def l(timestamp: Double, options: js.Any): String = js.native
    
    def t(code: String): String = js.native
    def t(code: String, options: js.Any): String = js.native
  }
  @JSImport("react-redux-i18n", "I18n")
  @js.native
  def I18n: I18n = js.native
  @scala.inline
  def I18n_=(x: I18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I18n")(x.asInstanceOf[js.Any])
  
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  class Localize protected ()
    extends Component[LocalizeProps, js.Object, js.Any] {
    def this(props: LocalizeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizeProps, context: js.Any) = this()
  }
  
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  class Translate protected ()
    extends Component[TranslateProps, js.Object, js.Any] {
    def this(props: TranslateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TranslateProps, context: js.Any) = this()
  }
  
  @JSImport("react-redux-i18n", "i18nReducer")
  @js.native
  def i18nReducer(): Reducer[I18nState, AnyAction] = js.native
  @JSImport("react-redux-i18n", "i18nReducer")
  @js.native
  def i18nReducer(state: js.UndefOr[scala.Nothing], options: js.Any): Reducer[I18nState, AnyAction] = js.native
  @JSImport("react-redux-i18n", "i18nReducer")
  @js.native
  def i18nReducer(state: js.Any): Reducer[I18nState, AnyAction] = js.native
  @JSImport("react-redux-i18n", "i18nReducer")
  @js.native
  def i18nReducer(state: js.Any, options: js.Any): Reducer[I18nState, AnyAction] = js.native
  
  @JSImport("react-redux-i18n", "loadTranslations")
  @js.native
  def loadTranslations(translationsObject: TranslationObjects): DispatchCallback[_] = js.native
  
  @JSImport("react-redux-i18n", "setLocale")
  @js.native
  def setLocale(locale: String): DispatchCallback[_] = js.native
  
  @JSImport("react-redux-i18n", "syncTranslationWithStore")
  @js.native
  def syncTranslationWithStore(store: Store[_, AnyAction]): Unit = js.native
  
  type DispatchCallback[S /* <: Action[_] */] = js.Function2[
    /* dispatch */ js.UndefOr[Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  
  @js.native
  trait I18nState extends StObject {
    
    var locale: String = js.native
    
    var translations: TranslationObjects = js.native
  }
  object I18nState {
    
    @scala.inline
    def apply(locale: String, translations: TranslationObjects): I18nState = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nState]
    }
    
    @scala.inline
    implicit class I18nStateMutableBuilder[Self <: I18nState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: TranslationObjects): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalizeProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var dangerousHTML: js.UndefOr[Boolean] = js.native
    
    var dateFormat: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tag: js.UndefOr[ReactType[_]] = js.native
    
    var value: String | Double | js.Object = js.native
  }
  object LocalizeProps {
    
    @scala.inline
    def apply(value: String | Double | js.Object): LocalizeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizeProps]
    }
    
    @scala.inline
    implicit class LocalizePropsMutableBuilder[Self <: LocalizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: ReactType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SubTranslationObject = String | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-redux-i18n.react-redux-i18n.SubTranslationObject */ js.Object
  ])
  
  @js.native
  trait TranslateProps
    extends /* prop */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var dangerousHTML: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tag: js.UndefOr[ReactType[_]] = js.native
    
    var value: String = js.native
  }
  object TranslateProps {
    
    @scala.inline
    def apply(value: String): TranslateProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateProps]
    }
    
    @scala.inline
    implicit class TranslatePropsMutableBuilder[Self <: TranslateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: ReactType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TranslationObjects = StringDictionary[SubTranslationObject]
}
