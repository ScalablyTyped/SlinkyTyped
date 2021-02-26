package typingsSlinky.firebaseComponent

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseComponent.componentContainerMod.ComponentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.PUBLIC
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.PRIVATE
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.VERSION
  */
  trait ComponentType extends StObject
  object ComponentType {
    
    @scala.inline
    def PRIVATE: typingsSlinky.firebaseComponent.firebaseComponentStrings.PRIVATE = "PRIVATE".asInstanceOf[typingsSlinky.firebaseComponent.firebaseComponentStrings.PRIVATE]
    
    @scala.inline
    def PUBLIC: typingsSlinky.firebaseComponent.firebaseComponentStrings.PUBLIC = "PUBLIC".asInstanceOf[typingsSlinky.firebaseComponent.firebaseComponentStrings.PUBLIC]
    
    @scala.inline
    def VERSION: typingsSlinky.firebaseComponent.firebaseComponentStrings.VERSION = "VERSION".asInstanceOf[typingsSlinky.firebaseComponent.firebaseComponentStrings.VERSION]
  }
  
  type Dictionary = StringDictionary[js.Any]
  
  type InstanceFactory[T /* <: Name */] = js.Function2[
    /* container */ ComponentContainer, 
    /* instanceIdentifier */ js.UndefOr[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.LAZY
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.EAGER
  */
  trait InstantiationMode extends StObject
  object InstantiationMode {
    
    @scala.inline
    def EAGER: typingsSlinky.firebaseComponent.firebaseComponentStrings.EAGER = "EAGER".asInstanceOf[typingsSlinky.firebaseComponent.firebaseComponentStrings.EAGER]
    
    @scala.inline
    def LAZY: typingsSlinky.firebaseComponent.firebaseComponentStrings.LAZY = "LAZY".asInstanceOf[typingsSlinky.firebaseComponent.firebaseComponentStrings.LAZY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.rocket
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.ship
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.fireball
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.test
    - typingsSlinky.firebaseComponent.firebaseComponentStrings.badtest
  */
  trait Name extends StObject
  
  @js.native
  trait NameServiceMapping extends StObject
  
  /* Inlined @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[@firebase/component.@firebase/component/dist/src/types.Name] */
  type Service = scala.Nothing
}
