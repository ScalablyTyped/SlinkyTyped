package typingsSlinky.jestWorker.typesMod

import typingsSlinky.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FarmOptions extends js.Object {
  var WorkerPool: js.UndefOr[
    js.Function2[
      /* workerPath */ String, 
      /* options */ js.UndefOr[WorkerPoolOptions], 
      WorkerPoolInterface
    ]
  ] = js.native
  var computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]] = js.native
  var enableWorkerThreads: js.UndefOr[Boolean] = js.native
  var exposedMethods: js.UndefOr[js.Array[String]] = js.native
  var forkOptions: js.UndefOr[ForkOptions] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var numWorkers: js.UndefOr[Double] = js.native
  var setupArgs: js.UndefOr[js.Array[_]] = js.native
}

object FarmOptions {
  @scala.inline
  def apply(): FarmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FarmOptions]
  }
  @scala.inline
  implicit class FarmOptionsOps[Self <: FarmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkerPool(
      value: (/* workerPath */ String, /* options */ js.UndefOr[WorkerPoolOptions]) => WorkerPoolInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerPool")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWorkerPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerPool")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeWorkerKey(value: (/* method */ String, /* repeated */ js.Any) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorkerKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComputeWorkerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorkerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWorkerThreads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWorkerThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWorkerThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWorkerThreads")(js.undefined)
        ret
    }
    @scala.inline
    def withExposedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposedMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withForkOptions(value: ForkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForkOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withNumWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupArgs")(js.undefined)
        ret
    }
  }
  
}

