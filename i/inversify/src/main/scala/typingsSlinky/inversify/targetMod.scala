package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.interfacesMod.interfaces.TargetType
import typingsSlinky.inversify.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetMod {
  
  @JSImport("inversify/dts/planning/target", "Target")
  @js.native
  class Target protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_]) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: String) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: Metadata) = this()
  }
}
