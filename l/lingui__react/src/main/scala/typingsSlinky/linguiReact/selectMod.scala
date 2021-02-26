package typingsSlinky.linguiReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.linguiReact.renderMod.RenderProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@lingui/react/Select", "Plural")
  @js.native
  class Plural protected ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any] {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react/Select", "Select")
  @js.native
  class Select protected ()
    extends Component[SelectPropsWithoutI18n, js.Object, js.Any] {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react/Select", "SelectOrdinal")
  @js.native
  class SelectOrdinal protected ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any] {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @js.native
  trait PluralPropsWithoutI18n
    extends RenderProps
       with /* exact */ StringDictionary[ReactElement] {
    
    var few: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var many: js.UndefOr[ReactElement] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var one: js.UndefOr[ReactElement] = js.native
    
    var other: ReactElement = js.native
    
    var two: js.UndefOr[ReactElement] = js.native
    
    var value: Double | String = js.native
    
    var zero: js.UndefOr[ReactElement] = js.native
  }
  object PluralPropsWithoutI18n {
    
    @scala.inline
    def apply(value: Double | String): PluralPropsWithoutI18n = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralPropsWithoutI18n]
    }
    
    @scala.inline
    implicit class PluralPropsWithoutI18nMutableBuilder[Self <: PluralPropsWithoutI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFew(value: ReactElement): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewReactElement(value: ReactElement): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMany(value: ReactElement): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyReactElement(value: ReactElement): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOne(value: ReactElement): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneReactElement(value: ReactElement): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      @scala.inline
      def setOther(value: ReactElement): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setTwo(value: ReactElement): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoReactElement(value: ReactElement): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: ReactElement): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroReactElement(value: ReactElement): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  @js.native
  trait SelectPropsWithoutI18n
    extends RenderProps
       with /* exact */ StringDictionary[ReactElement] {
    
    var id: js.UndefOr[String] = js.native
    
    var other: ReactElement = js.native
    
    var value: String = js.native
  }
  object SelectPropsWithoutI18n {
    
    @scala.inline
    def apply(value: String): SelectPropsWithoutI18n = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectPropsWithoutI18n]
    }
    
    @scala.inline
    implicit class SelectPropsWithoutI18nMutableBuilder[Self <: SelectPropsWithoutI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOther(value: ReactElement): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
