package typingsSlinky.firebaseComponent

import typingsSlinky.firebaseComponent.typesMod.ComponentType
import typingsSlinky.firebaseComponent.typesMod.InstantiationMode
import typingsSlinky.firebaseComponent.typesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseComponentStrings {
  
  @scala.inline
  def EAGER: EAGER = "EAGER".asInstanceOf[EAGER]
  
  @scala.inline
  def LAZY: LAZY = "LAZY".asInstanceOf[LAZY]
  
  @scala.inline
  def PRIVATE: PRIVATE = "PRIVATE".asInstanceOf[PRIVATE]
  
  @scala.inline
  def PUBLIC: PUBLIC = "PUBLIC".asInstanceOf[PUBLIC]
  
  @scala.inline
  def VERSION: VERSION = "VERSION".asInstanceOf[VERSION]
  
  @scala.inline
  def badtest: badtest = "badtest".asInstanceOf[badtest]
  
  @scala.inline
  def fireball: fireball = "fireball".asInstanceOf[fireball]
  
  @scala.inline
  def rocket: rocket = "rocket".asInstanceOf[rocket]
  
  @scala.inline
  def ship: ship = "ship".asInstanceOf[ship]
  
  @scala.inline
  def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait EAGER extends InstantiationMode
  
  @js.native
  sealed trait LAZY extends InstantiationMode
  
  @js.native
  sealed trait PRIVATE extends ComponentType
  
  @js.native
  sealed trait PUBLIC extends ComponentType
  
  @js.native
  sealed trait VERSION extends ComponentType
  
  @js.native
  sealed trait badtest extends Name
  
  @js.native
  sealed trait fireball extends Name
  
  @js.native
  sealed trait rocket extends Name
  
  @js.native
  sealed trait ship extends Name
  
  @js.native
  sealed trait test extends Name
}
