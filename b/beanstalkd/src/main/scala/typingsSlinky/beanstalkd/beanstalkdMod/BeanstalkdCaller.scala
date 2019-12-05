package typingsSlinky.beanstalkd.beanstalkdMod

import typingsSlinky.beanstalkd.beanstalkdStrings.on
import typingsSlinky.beanstalkd.beanstalkdStrings.unref
import typingsSlinky.std.Exclude
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdCaller extends js.Object {
  def call[K /* <: Exclude[
    FunctionsNames[BeanstalkdClient], 
    on | unref | typingsSlinky.beanstalkd.beanstalkdStrings.call
  ] */](
    fn: K,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type ArgsType<Required<BeanstalkdClient>[K]> is not an array type */ args: ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<beanstalkd.beanstalkd.BeanstalkdClient>[K] */ js.Any
    ]
  ): (MergePromise[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<beanstalkd.beanstalkd.BeanstalkdClient>[K] */ js.Any
    ]
  ]) with BeanstalkdCaller
}

object BeanstalkdCaller {
  @scala.inline
  def apply(
    call: (js.Any, ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<beanstalkd.beanstalkd.BeanstalkdClient>[K] */ js.Any
    ]) => (MergePromise[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Required<beanstalkd.beanstalkd.BeanstalkdClient>[K] */ js.Any
      ]
    ]) with BeanstalkdCaller
  ): BeanstalkdCaller = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
  
    __obj.asInstanceOf[BeanstalkdCaller]
  }
}

