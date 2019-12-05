package typingsSlinky.aframe.aframeMod._Global_.AFRAME

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.aframe.aframeMod.MinimalShaderDefinition
import typingsSlinky.aframe.aframeMod.ShaderConstructor
import typingsSlinky.aframe.aframeMod.ShaderDefinition
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

