package typingsSlinky.jupyterlabObservables.modeldbMod.ModelDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a `ModelDB` object.
  */
@js.native
trait ICreateOptions extends js.Object {
  /**
    * A ModelDB to use as the store for this
    * ModelDB. If none is given, it uses its own store.
    */
  var baseDB: js.UndefOr[typingsSlinky.jupyterlabObservables.modeldbMod.ModelDB] = js.native
  /**
    * The base path to prepend to all the path arguments.
    */
  var basePath: js.UndefOr[String] = js.native
}

object ICreateOptions {
  @scala.inline
  def apply(): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateOptions]
  }
  @scala.inline
  implicit class ICreateOptionsOps[Self <: ICreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDB(value: typingsSlinky.jupyterlabObservables.modeldbMod.ModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDB")(js.undefined)
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
  }
  
}

