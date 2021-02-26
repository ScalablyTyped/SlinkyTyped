package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.StatisticDefinition
import typingsSlinky.arcgisJsApi.esri.StatisticDefinitionConstructor
import typingsSlinky.arcgisJsApi.esri.StatisticDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticDefinitionMod extends Shortcut {
  
  @JSImport("esri/tasks/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  val ^ : StatisticDefinitionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  class Class () extends StatisticDefinition {
    def this(properties: StatisticDefinitionProperties) = this()
  }
  
  type _To = StatisticDefinitionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `statisticDefinitionMod.foo` */
  override def _to: StatisticDefinitionConstructor = ^
}
