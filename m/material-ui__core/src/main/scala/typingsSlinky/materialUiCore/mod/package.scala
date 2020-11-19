package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.materialUiCore.materialUiCoreStrings.ConsistentWith with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Overwrite[T, U] = (typingsSlinky.materialUiCore.mod.Omit[T, /* keyof U */ java.lang.String]) with U
  
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    slinky.core.ReactComponentClass[
      (typingsSlinky.materialUiCore.mod.Omit[
        typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[_, typingsSlinky.materialUiCore.mod.PropsOf[_]], 
        /* keyof InjectedProps */ java.lang.String
      ]) with AdditionalProps
    ]
  ]
  
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[C] */ js.Any
  
  type StandardProps[C, ClassKey /* <: java.lang.String */, Removals /* <: /* keyof C */ java.lang.String */] = (typingsSlinky.materialUiCore.mod.Omit[C, typingsSlinky.materialUiCore.materialUiCoreStrings.classes | Removals]) with typingsSlinky.materialUiCore.withStylesMod.StyledComponentProps[ClassKey] with typingsSlinky.materialUiCore.anon.ClassName
}
