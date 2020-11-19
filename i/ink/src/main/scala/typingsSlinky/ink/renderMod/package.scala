package typingsSlinky.ink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object renderMod {
  
  type RenderFunction = js.Function2[
    /* tree */ slinky.core.facade.ReactElement, 
    /* options */ js.UndefOr[
      typingsSlinky.node.processMod.global.NodeJS.WriteStream | typingsSlinky.ink.renderMod.RenderOptions
    ], 
    typingsSlinky.ink.renderMod.Instance
  ]
}
