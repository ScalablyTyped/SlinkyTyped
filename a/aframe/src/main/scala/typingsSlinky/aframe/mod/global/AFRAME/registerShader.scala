package typingsSlinky.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.aframe.mod.MinimalShaderDefinition
import typingsSlinky.aframe.mod.ShaderConstructor
import typingsSlinky.aframe.mod.ShaderDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerShader")
@js.native
object registerShader
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* shader */ ShaderDefinition[MinimalShaderDefinition with js.Object], 
        ShaderConstructor[MinimalShaderDefinition with js.Object]
      ]
    ]

