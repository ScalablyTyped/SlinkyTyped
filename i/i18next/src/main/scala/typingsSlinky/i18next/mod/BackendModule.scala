package typingsSlinky.i18next.mod

import typingsSlinky.i18next.i18nextStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to load data for i18next.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'backend'` For a prototype constructor set static property.
  */
@js.native
trait BackendModule[TOptions] extends Module {
  /** Load multiple languages and namespaces. For backends supporting multiple resources loading */
  var readMulti: js.UndefOr[
    js.Function3[
      /* languages */ js.Array[String], 
      /* namespaces */ js.Array[String], 
      /* callback */ ReadCallback, 
      Unit
    ]
  ] = js.native
  /** Store the translation. For backends acting as cache layer */
  var save: js.UndefOr[
    js.Function3[/* language */ String, /* namespace */ String, /* data */ ResourceLanguage, Unit]
  ] = js.native
  @JSName("type")
  var type_BackendModule: backend = js.native
  /** Save the missing translation */
  def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
  def init(services: Services, backendOptions: TOptions, i18nextOptions: InitOptions): Unit = js.native
  def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
}

object BackendModule {
  @scala.inline
  def apply[TOptions](
    create: (js.Array[String], String, String, String) => Unit,
    init: (Services, TOptions, InitOptions) => Unit,
    read: (String, String, ReadCallback) => Unit,
    `type`: backend
  ): BackendModule[TOptions] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), init = js.Any.fromFunction3(init), read = js.Any.fromFunction3(read))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendModule[TOptions]]
  }
  @scala.inline
  implicit class BackendModuleOps[Self[toptions] <: BackendModule[toptions], TOptions] (val x: Self[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOptions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOptions] with Other]
    @scala.inline
    def withCreate(value: (js.Array[String], String, String, String) => Unit): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withInit(value: (Services, TOptions, InitOptions) => Unit): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRead(value: (String, String, ReadCallback) => Unit): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(value: backend): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadMulti(
      value: (/* languages */ js.Array[String], /* namespaces */ js.Array[String], /* callback */ ReadCallback) => Unit
    ): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMulti")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReadMulti: Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: (/* language */ String, /* namespace */ String, /* data */ ResourceLanguage) => Unit): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSave: Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
  }
  
}

