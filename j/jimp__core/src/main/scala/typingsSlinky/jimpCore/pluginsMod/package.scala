package typingsSlinky.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluginsMod {
  type ClassOrConstantPlugin[T /* <: typingsSlinky.jimpCore.etcMod.Image */] = typingsSlinky.jimpCore.pluginsMod.WellFormedPlugin[T] with (typingsSlinky.std.Required[
    typingsSlinky.std.Pick[
      typingsSlinky.jimpCore.pluginsMod.WellFormedPlugin[T], 
      typingsSlinky.jimpCore.jimpCoreStrings.`class` | typingsSlinky.jimpCore.jimpCoreStrings.constants
    ]
  ])
  type IllformedPlugin = (typingsSlinky.jimpCore.utilsMod.Omit[
    _, 
    typingsSlinky.jimpCore.jimpCoreStrings.`class` | typingsSlinky.jimpCore.jimpCoreStrings.constants
  ]) with typingsSlinky.jimpCore.anon.Class
  type JimpPlugin[T /* <: typingsSlinky.jimpCore.etcMod.Image */] = typingsSlinky.jimpCore.pluginsMod.ClassOrConstantPlugin[T] | typingsSlinky.jimpCore.pluginsMod.IllformedPlugin
}
