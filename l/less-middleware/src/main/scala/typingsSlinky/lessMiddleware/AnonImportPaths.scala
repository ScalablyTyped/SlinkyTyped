package typingsSlinky.lessMiddleware

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImportPaths extends js.Object {
  /**
    * Function that modifies the import paths used by the less parser per request.
    */
  var importPaths: js.UndefOr[
    js.Function2[
      /* paths */ js.Array[String], 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      js.Array[String]
    ]
  ] = js.native
  /**
    * Function that modifies the raw less output before being parsed and compiled.
    */
  var less: js.UndefOr[
    js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.native
  /**
    * Function that modifies the less pathname before being loaded from the filesystem.
    */
  var path: js.UndefOr[
    js.Function2[/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
  ] = js.native
}

object AnonImportPaths {
  @scala.inline
  def apply(): AnonImportPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonImportPaths]
  }
  @scala.inline
  implicit class AnonImportPathsOps[Self <: AnonImportPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportPaths(
      value: (/* paths */ js.Array[String], /* req */ Request_[ParamsDictionary, _, _, Query]) => js.Array[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importPaths")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutImportPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withLess(value: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: (/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

