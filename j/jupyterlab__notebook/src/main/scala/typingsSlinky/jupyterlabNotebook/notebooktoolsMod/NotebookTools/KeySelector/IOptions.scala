package typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a keyselector.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Default value for default setters and getters if value is not found.
    */
  var default: js.UndefOr[JSONValue] = js.native
  /**
    * An optional value getter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @returns The appropriate value for the selector.
    */
  var getter: js.UndefOr[js.Function1[/* cell */ Cell, JSONValue]] = js.native
  /**
    * The metadata key of interest.
    */
  var key: String = js.native
  /**
    * The map of options to values.
    *
    * #### Notes
    * If a value equals the default, choosing it may erase the key from the
    * metadata.
    */
  var optionsMap: StringDictionary[JSONValue] = js.native
  /**
    * An optional value setter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @param value - The value of the selector.
    *
    * #### Notes
    * The setter should set the appropriate metadata value given the value of
    * the selector.
    */
  var setter: js.UndefOr[js.Function2[/* cell */ Cell, /* value */ JSONValue, Unit]] = js.native
  /**
    * The optional title of the selector - defaults to capitalized `key`.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The optional valid cell types - defaults to all valid types.
    */
  var validCellTypes: js.UndefOr[js.Array[CellType]] = js.native
}

object IOptions {
  @scala.inline
  def apply(key: String, optionsMap: StringDictionary[JSONValue]): IOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optionsMap = optionsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsMap(value: StringDictionary[JSONValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: JSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
    @scala.inline
    def withGetter(value: /* cell */ Cell => JSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetter(value: (/* cell */ Cell, /* value */ JSONValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withValidCellTypes(value: js.Array[CellType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validCellTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidCellTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validCellTypes")(js.undefined)
        ret
    }
  }
  
}

