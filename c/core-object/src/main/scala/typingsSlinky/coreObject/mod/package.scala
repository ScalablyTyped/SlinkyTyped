package typingsSlinky.coreObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typingsSlinky.coreObject.coreObjectStrings.ExtendOptions with org.scalablytyped.runtime.TopLevel[Base] with (typingsSlinky.std.Record[java.lang.String, _])
  
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = typingsSlinky.std.ThisType[
    (typingsSlinky.coreObject.utilsMod.Mix[Base, Ext]) with typingsSlinky.coreObject.anon.Super[Base]
  ]
}
