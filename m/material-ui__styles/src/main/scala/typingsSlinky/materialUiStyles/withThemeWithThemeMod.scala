package typingsSlinky.materialUiStyles

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiStyles.defaultThemeMod.DefaultTheme
import typingsSlinky.materialUiStyles.materialUiStylesStrings.innerRef
import typingsSlinky.materialUiStyles.materialUiStylesStrings.theme
import typingsSlinky.materialUiTypes.mod.ConsistentWith
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.materialUiTypes.mod.PropInjector
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withThemeWithThemeMod {
  
  @JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Default)
  @js.native
  def default[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], js.Object]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  @JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Default)
  @js.native
  def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  
  @JSImport("@material-ui/styles/withTheme/withTheme", "withThemeCreator")
  @js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @JSImport("@material-ui/styles/withTheme/withTheme", "withThemeCreator")
  @js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  
  /* Inlined parent std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<@material-ui/styles.@material-ui/styles/defaultTheme.DefaultTheme>> */
  @js.native
  trait ThemedComponentProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[_]] = js.native
    
    var ref: js.UndefOr[Ref[_]] = js.native
    
    var theme: js.UndefOr[DefaultTheme] = js.native
  }
  object ThemedComponentProps {
    
    @scala.inline
    def apply(): ThemedComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemedComponentProps]
    }
    
    @scala.inline
    implicit class ThemedComponentPropsMutableBuilder[Self <: ThemedComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait WithTheme[Theme] extends StObject {
    
    /**
      * Deprecated. Will be removed in v5. Refs are now automatically forwarded to
      * the inner component.
      * @deprecated since version 4.0
      */
    var innerRef: js.UndefOr[Ref[_]] = js.native
    
    var theme: Theme = js.native
  }
  object WithTheme {
    
    @scala.inline
    def apply[Theme](theme: Theme): WithTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithTheme[Theme]]
    }
    
    @scala.inline
    implicit class WithThemeMutableBuilder[Self <: WithTheme[_], Theme] (val x: Self with WithTheme[Theme]) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WithThemeCreatorOption[Theme] extends StObject {
    
    var defaultTheme: js.UndefOr[Theme] = js.native
  }
  object WithThemeCreatorOption {
    
    @scala.inline
    def apply[Theme](): WithThemeCreatorOption[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithThemeCreatorOption[Theme]]
    }
    
    @scala.inline
    implicit class WithThemeCreatorOptionMutableBuilder[Self <: WithThemeCreatorOption[_], Theme] (val x: Self with WithThemeCreatorOption[Theme]) extends AnyVal {
      
      @scala.inline
      def setDefaultTheme(value: Theme): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
    }
  }
}
