package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import typingsSlinky.ngTable.resultsMod.IDataRowGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGroupMod {
  
  type IGetGroupFunc[T] = js.Function1[
    /* params */ NgTableParams[T], 
    js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
  ]
}
