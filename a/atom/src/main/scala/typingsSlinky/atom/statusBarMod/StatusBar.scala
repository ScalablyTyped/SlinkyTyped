package typingsSlinky.atom.statusBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBar extends js.Object {
  /**
    *  Add a tile to the left side of the status bar. Lower priority tiles are placed
    *  further to the left.
    */
  def addLeftTile(options: AddTileOptions): Tile = js.native
  /**
    *  Add a tile to the right side of the status bar. Lower priority tiles are placed
    *  further to the right.
    */
  def addRightTile(options: AddTileOptions): Tile = js.native
  /** Retrieve all of the tiles on the left side of the status bar. */
  def getLeftTiles(): js.Array[Tile] = js.native
  /** Retrieve all of the tiles on the right side of the status bar. */
  def getRightTiles(): js.Array[Tile] = js.native
}

object StatusBar {
  @scala.inline
  def apply(
    addLeftTile: AddTileOptions => Tile,
    addRightTile: AddTileOptions => Tile,
    getLeftTiles: () => js.Array[Tile],
    getRightTiles: () => js.Array[Tile]
  ): StatusBar = {
    val __obj = js.Dynamic.literal(addLeftTile = js.Any.fromFunction1(addLeftTile), addRightTile = js.Any.fromFunction1(addRightTile), getLeftTiles = js.Any.fromFunction0(getLeftTiles), getRightTiles = js.Any.fromFunction0(getRightTiles))
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLeftTile(value: AddTileOptions => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLeftTile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRightTile(value: AddTileOptions => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRightTile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLeftTiles(value: () => js.Array[Tile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeftTiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRightTiles(value: () => js.Array[Tile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRightTiles")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

