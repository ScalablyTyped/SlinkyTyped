package typingsSlinky.reactNativeElements

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DividerProps = typingsSlinky.reactNative.mod.ViewProperties
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ReactElement
    - typingsSlinky.reactNativeElements.mod.TextProps
    - typingsSlinky.reactNativeElements.mod.HeaderIcon
  */
  type HeaderSubComponent = typingsSlinky.reactNativeElements.mod._HeaderSubComponent | slinky.core.facade.ReactElement
  
  type IconNode = scala.Boolean | slinky.core.facade.ReactElement | typingsSlinky.reactNativeElements.anon.PartialIconProps
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.material
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`material-community`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.zocial
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`font-awesome`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.octicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.ionicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.foundation
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.evilicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.entypo
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.antdesign
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`font-awesome-5`
    - java.lang.String
  */
  type IconType = typingsSlinky.reactNativeElements.mod._IconType | java.lang.String
  
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
    */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.RecursivePartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ReplaceTheme = js.Function1[
    /* updates */ typingsSlinky.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
  
  type SearchBarProps = typingsSlinky.reactNativeElements.mod.SearchBarWrapper with typingsSlinky.reactNativeElements.mod.SearchBarBase with typingsSlinky.reactNativeElements.mod.SearchBarPlatform with typingsSlinky.reactNativeElements.mod.SearchBarDefault with typingsSlinky.reactNativeElements.mod.SearchBarIOS with typingsSlinky.reactNativeElements.mod.SearchBarAndroid
  
  type Theme[T] = typingsSlinky.reactNativeElements.anon.PartialFullTheme with T
  
  @scala.inline
  def ThemeContext: typingsSlinky.react.mod.Context[typingsSlinky.reactNativeElements.mod.ThemeProps[js.Object]] = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[typingsSlinky.react.mod.Context[typingsSlinky.reactNativeElements.mod.ThemeProps[js.Object]]]
  
  type TouchableComponent = typingsSlinky.reactNative.mod.TouchableHighlightProps
  
  type UpdateTheme = js.Function1[
    /* updates */ typingsSlinky.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
  
  @scala.inline
  def colors: typingsSlinky.reactNativeElements.mod.Colors_ = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].selectDynamic("colors").asInstanceOf[typingsSlinky.reactNativeElements.mod.Colors_]
  
  @scala.inline
  def getIconType(`type`: typingsSlinky.reactNativeElements.mod.IconType): js.Any = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getIconType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def normalize(size: scala.Double): scala.Double = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(size.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def registerCustomIconType(id: java.lang.String, font: js.Any): scala.Unit = (typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomIconType")(id.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def withBadge(): js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ] = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")().asInstanceOf[js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ]]
  @scala.inline
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.UndefOr[slinky.core.facade.ReactElement],
    /**
    * Options to configure the badge
    */
  options: typingsSlinky.reactNativeElements.anon.bottomnumberundefinedleft
  ): js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ] = (typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ]]
  @scala.inline
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[slinky.core.facade.ReactElement]
  ): js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ] = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ]]
  @scala.inline
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[slinky.core.facade.ReactElement],
    /**
    * Options to configure the badge
    */
  options: typingsSlinky.reactNativeElements.anon.bottomnumberundefinedleft
  ): js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ] = (typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ]]
  @scala.inline
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: slinky.core.facade.ReactElement): js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ] = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBadge")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ slinky.core.ReactComponentClass[js.Object], 
    slinky.core.ReactComponentClass[js.Object]
  ]]
  
  @scala.inline
  def withTheme[P, T](
    component: slinky.core.ReactComponentClass[P with typingsSlinky.reactNativeElements.mod.ThemeProps[T]]
  ): slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.theme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.updateTheme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.replaceTheme
    ]
  ] = typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.theme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.updateTheme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.replaceTheme
    ]
  ]]
  @scala.inline
  def withTheme[P, T](
    component: slinky.core.ReactComponentClass[P with typingsSlinky.reactNativeElements.mod.ThemeProps[T]],
    themeKey: java.lang.String
  ): slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.theme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.updateTheme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.replaceTheme
    ]
  ] = (typingsSlinky.reactNativeElements.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any], themeKey.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.theme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.updateTheme | typingsSlinky.reactNativeElements.reactNativeElementsStrings.replaceTheme
    ]
  ]]
}
