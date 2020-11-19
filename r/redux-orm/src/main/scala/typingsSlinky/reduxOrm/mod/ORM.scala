package typingsSlinky.reduxOrm.mod

import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.reduxOrm.ormMod.ORMOpts
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm", "ORM")
@js.native
/**
  * Creates a new ORM instance.
  */
class ORM[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, ModelNames /* <: /* keyof I */ String */] ()
  extends typingsSlinky.reduxOrm.ormMod.ORM[I, ModelNames] {
  def this(opts: ORMOpts) = this()
}
