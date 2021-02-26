package typingsSlinky.jointjs.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.dia.Cell
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionStrategies {
  
  @JSImport("jointjs", "connectionStrategies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "connectionStrategies.pinAbsolute")
  @js.native
  def pinAbsolute: ConnectionStrategy = js.native
  @scala.inline
  def pinAbsolute_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinAbsolute")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionStrategies.pinRelative")
  @js.native
  def pinRelative: ConnectionStrategy = js.native
  @scala.inline
  def pinRelative_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinRelative")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionStrategies.useDefaults")
  @js.native
  def useDefaults: ConnectionStrategy = js.native
  @scala.inline
  def useDefaults_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(x.asInstanceOf[js.Any])
  
  type ConnectionStrategy = js.Function4[
    /* endDefinition */ Cell, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* coords */ Point, 
    Element
  ]
}
