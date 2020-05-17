package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XDictionary1 extends XNamed {
  val Count: Double = js.native
  val DictionaryType: typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  val Entries: SafeArray[XDictionaryEntry] = js.native
  var Language: Double = js.native
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean = js.native
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  def addEntry(xDicEntry: XDictionaryEntry): Boolean = js.native
  def clear(): Unit = js.native
  def getCount(): Double = js.native
  def getDictionaryType(): typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  def getEntries(): SafeArray[XDictionaryEntry] = js.native
  def getEntry(aWord: String): XDictionaryEntry = js.native
  def getLanguage(): Double = js.native
  def isActive(): Boolean = js.native
  def isFull(): Boolean = js.native
  def remove(aWord: String): Boolean = js.native
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  def setActive(bActivate: Boolean): Unit = js.native
  def setLanguage(nLang: Double): Unit = js.native
}

object XDictionary1 {
  @scala.inline
  def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Language: Double,
    Name: String,
    acquire: () => Unit,
    add: (String, Boolean, String) => Boolean,
    addDictionaryEventListener: XDictionaryEventListener => Boolean,
    addEntry: XDictionaryEntry => Boolean,
    clear: () => Unit,
    getCount: () => Double,
    getDictionaryType: () => DictionaryType,
    getEntries: () => SafeArray[XDictionaryEntry],
    getEntry: String => XDictionaryEntry,
    getLanguage: () => Double,
    getName: () => String,
    isActive: () => Boolean,
    isFull: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    setActive: Boolean => Unit,
    setLanguage: Double => Unit,
    setName: String => Unit
  ): XDictionary1 = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1(setActive), setLanguage = js.Any.fromFunction1(setLanguage), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XDictionary1]
  }
  @scala.inline
  implicit class XDictionary1Ops[Self <: XDictionary1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryType(value: DictionaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DictionaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: SafeArray[XDictionaryEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: (String, Boolean, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDictionaryEventListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddEntry(value: XDictionaryEntry => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEntry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDictionaryType(value: () => DictionaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDictionaryType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntries(value: () => SafeArray[XDictionaryEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntry(value: String => XDictionaryEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLanguage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFull(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDictionaryEventListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActive(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLanguage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLanguage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

