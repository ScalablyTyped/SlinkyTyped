package typingsSlinky.ncp.anon

import typingsSlinky.ncp.mod.File
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ncp.ncp.Options & {  errs  :node.fs.PathLike} */
trait OptionserrsPathLike extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.undefined
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errs: js.UndefOr[PathLike] = js.undefined
  var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var stopOnErr: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
  ] = js.undefined
}

object OptionserrsPathLike {
  @scala.inline
  def apply(
    clobber: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    errs: PathLike = null,
    filter: js.RegExp | (js.Function1[/* filename */ String, Boolean]) = null,
    limit: js.UndefOr[Double] = js.undefined,
    stopOnErr: js.UndefOr[Boolean] = js.undefined,
    transform: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit = null
  ): OptionserrsPathLike = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.get.asInstanceOf[js.Any])
    if (errs != null) __obj.updateDynamic("errs")(errs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnErr)) __obj.updateDynamic("stopOnErr")(stopOnErr.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[OptionserrsPathLike]
  }
}

