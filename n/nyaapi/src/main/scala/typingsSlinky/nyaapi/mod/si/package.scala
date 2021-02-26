package typingsSlinky.nyaapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object si {
  
  type UserStatus = scala.Double
  
  @scala.inline
  def search(term: java.lang.String): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(
    term: java.lang.String,
    n: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(term: java.lang.String, n: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(term: java.lang.String, n: scala.Double, opts: typingsSlinky.nyaapi.mod.si.SearchOptions): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    n: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm, n: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def search(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    n: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def searchAll(term: java.lang.String): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAll(term: java.lang.String, opts: typingsSlinky.nyaapi.mod.si.SearchOptions): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAll(term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAll(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def searchAllByUser(user: java.lang.String, term: java.lang.String): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAllByUser(user: java.lang.String, term: java.lang.String, opts: typingsSlinky.nyaapi.mod.si.SearchOptions): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAllByUser(user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm, term: java.lang.String): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchAllByUser(
    user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    term: java.lang.String,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def searchByUser(user: java.lang.String, term: java.lang.String, n: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUser(
    user: java.lang.String,
    term: java.lang.String,
    n: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUser(user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm, term: java.lang.String, n: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUser(
    user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    term: java.lang.String,
    n: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def searchByUserAndByPage(user: java.lang.String, term: java.lang.String, p: scala.Double, n: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUserAndByPage(
    user: java.lang.String,
    term: java.lang.String,
    p: scala.Double,
    n: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUserAndByPage(
    user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    term: java.lang.String,
    p: scala.Double,
    n: scala.Double
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchByUserAndByPage(
    user: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    term: java.lang.String,
    p: scala.Double,
    n: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def searchPage(term: java.lang.String, p: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(
    term: java.lang.String,
    p: scala.Double,
    opts: js.UndefOr[scala.Nothing],
    includeMaxPage: scala.Boolean
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(term: java.lang.String, p: scala.Double, opts: typingsSlinky.nyaapi.mod.si.SearchOptions): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(
    term: java.lang.String,
    p: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions,
    includeMaxPage: scala.Boolean
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm, p: scala.Double): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    p: scala.Double,
    opts: js.UndefOr[scala.Nothing],
    includeMaxPage: scala.Boolean
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    p: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  @scala.inline
  def searchPage(
    term: typingsSlinky.nyaapi.mod.si.SearchOptionsTerm,
    p: scala.Double,
    opts: typingsSlinky.nyaapi.mod.si.SearchOptions,
    includeMaxPage: scala.Boolean
  ): js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]] = (typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsSlinky.nyaapi.mod.si.Torrent]]]
  
  @scala.inline
  def upload(opts: typingsSlinky.nyaapi.mod.si.UploadData): js.Promise[typingsSlinky.nyaapi.mod.si.Torrent] = typingsSlinky.nyaapi.mod.si.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.nyaapi.mod.si.Torrent]]
}
