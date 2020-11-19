package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routers {
  
  type GenericRouter[K /* <: typingsSlinky.jointjs.mod.routers.RouterType */] = js.Function3[
    /* vertices */ js.Array[typingsSlinky.jointjs.mod.dia.Point], 
    /* args */ js.UndefOr[typingsSlinky.jointjs.mod.routers.GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[typingsSlinky.jointjs.mod.dia.LinkView], 
    js.Array[typingsSlinky.jointjs.mod.dia.Point]
  ]
  
  type GenericRouterArguments[K /* <: typingsSlinky.jointjs.mod.routers.RouterType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  
  type Router = typingsSlinky.jointjs.mod.routers.GenericRouter[typingsSlinky.jointjs.mod.routers.RouterType]
  
  type RouterJSON = typingsSlinky.jointjs.mod.routers.GenericRouterJSON[typingsSlinky.jointjs.mod.routers.RouterType]
}
