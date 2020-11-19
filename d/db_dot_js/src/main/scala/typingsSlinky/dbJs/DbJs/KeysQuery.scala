package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeysQuery[T]
  extends DescableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DistinctableQuery[T]
     with MappableQuery[T]
