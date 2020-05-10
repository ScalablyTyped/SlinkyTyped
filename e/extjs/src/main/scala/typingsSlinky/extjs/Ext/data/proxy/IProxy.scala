package typingsSlinky.extjs.Ext.data.proxy

import typingsSlinky.extjs.Ext.data.IBatch
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IOperation
import typingsSlinky.extjs.Ext.data.reader.IReader
import typingsSlinky.extjs.Ext.data.writer.IWriter
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxy extends IObservable {
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
  		* @param options Object Object containing one or more properties supported by the batch method:
  		* @returns Ext.data.Batch The newly created Batch
  		*/
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.native
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[String] = js.native
  /** [Method] Performs the given create operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var create: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Performs the given destroy operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var destroy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the model attached to this Proxy
  		* @returns Ext.data.Model The model
  		*/
  var getModel: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the reader currently attached to this proxy instance
  		* @returns Ext.data.reader.Reader The Reader instance
  		*/
  var getReader: js.UndefOr[js.Function0[IReader]] = js.native
  /** [Method] Returns the writer currently attached to this proxy instance
  		* @returns Ext.data.writer.Writer The Writer instance
  		*/
  var getWriter: js.UndefOr[js.Function0[IWriter]] = js.native
  /** [Property] (Boolean) */
  var isProxy: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isSynchronous: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[js.Any] = js.native
  /** [Method] Performs the given read operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var read: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the model associated with this proxy
  		* @param model String/Ext.data.Model The new model. Can be either the model name string, or a reference to the model's constructor
  		* @param setOnStore Boolean Sets the new model on the associated Store, if one is present
  		*/
  var setModel: js.UndefOr[
    js.Function2[/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the Proxy s Reader by string config object or Reader instance
  		* @param reader String/Object/Ext.data.reader.Reader The new Reader, which can be either a type string, a configuration object or an Ext.data.reader.Reader instance
  		* @returns Ext.data.reader.Reader The attached Reader object
  		*/
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[js.Any], IReader]] = js.native
  /** [Method] Sets the Proxy s Writer by string config object or Writer instance
  		* @param writer String/Object/Ext.data.writer.Writer The new Writer, which can be either a type string, a configuration object or an Ext.data.writer.Writer instance
  		* @returns Ext.data.writer.Writer The attached Writer object
  		*/
  var setWriter: js.UndefOr[js.Function1[/* writer */ js.UndefOr[js.Any], IWriter]] = js.native
  /** [Method] Performs the given update operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var update: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.native
}

object IProxy {
  @scala.inline
  def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  @scala.inline
  implicit class IProxyOps[Self <: IProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReader(value: () => IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWriter(value: () => IWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSynchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSynchronous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSynchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModel(value: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReader(value: /* reader */ js.UndefOr[js.Any] => IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWriter(value: /* writer */ js.UndefOr[js.Any] => IWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWriter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.undefined)
        ret
    }
  }
  
}

