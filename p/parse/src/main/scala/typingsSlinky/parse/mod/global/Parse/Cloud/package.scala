package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Cloud {
  
  type AfterDeleteRequest = typingsSlinky.parse.mod.global.Parse.Cloud.TriggerRequest
  
  // tslint:disable-line no-empty-interface
  type BeforeDeleteRequest = typingsSlinky.parse.mod.global.Parse.Cloud.TriggerRequest
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def afterDelete(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def afterDelete(
    arg1: js.Any,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.AfterDeleteRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterDeleteFile(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")().asInstanceOf[scala.Unit]
  @scala.inline
  def afterDeleteFile(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FileTriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterFind(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def afterFind(
    arg1: js.Any,
    func: js.Function1[/* request */ typingsSlinky.parse.mod.global.Parse.Cloud.AfterFindRequest, _]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterLogin(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")().asInstanceOf[scala.Unit]
  @scala.inline
  def afterLogin(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.TriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterLogout(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")().asInstanceOf[scala.Unit]
  @scala.inline
  def afterLogout(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.TriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterSave(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def afterSave(
    arg1: js.Any,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.AfterSaveRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def afterSaveFile(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")().asInstanceOf[scala.Unit]
  @scala.inline
  def afterSaveFile(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FileTriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeDelete(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def beforeDelete(
    arg1: js.Any,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.BeforeDeleteRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeDeleteFile(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")().asInstanceOf[scala.Unit]
  @scala.inline
  def beforeDeleteFile(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FileTriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeFind(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.BeforeFindRequest, 
      (js.Promise[
        (typingsSlinky.parse.mod.global.Parse.Query[
          typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
        ]) | scala.Unit
      ]) | (typingsSlinky.parse.mod.global.Parse.Query[
        typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
      ]) | scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeLogin(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")().asInstanceOf[scala.Unit]
  @scala.inline
  def beforeLogin(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.TriggerRequest, 
      js.Thenable[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeSave(arg1: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def beforeSave(
    arg1: js.Any,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.BeforeSaveRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def beforeSaveFile(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")().asInstanceOf[scala.Unit]
  @scala.inline
  def beforeSaveFile(
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FileTriggerRequest, 
      js.Thenable[typingsSlinky.parse.mod.global.Parse.File] | scala.Unit
    ]
  ): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def define(
    name: java.lang.String,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FunctionRequest[typingsSlinky.parse.mod.global.Parse.Cloud.Params], 
      _
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def define_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ typingsSlinky.parse.parseStrings.define with org.scalablytyped.runtime.TopLevel[typingsSlinky.std.Parameters[T]], 
    _
  ] */](
    name: java.lang.String,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[typingsSlinky.std.ReturnType[T]] | typingsSlinky.std.ReturnType[T]
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def define_T_Function0Wildcard[T /* <: js.Function0[_] */](
    name: java.lang.String,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.FunctionRequest[js.Object], 
      js.Promise[typingsSlinky.std.ReturnType[T]] | typingsSlinky.std.ReturnType[T]
    ]
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Gets job status by Id
    * @param jobStatusId The Id of Job Status.
    * @returns Status of Job.
    */
  @scala.inline
  def getJobStatus(jobStatusId: java.lang.String): js.Promise[
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
  ] = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("getJobStatus")(jobStatusId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
  ]]
  
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  @scala.inline
  def getJobsData(): js.Promise[
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
  ] = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("getJobsData")().asInstanceOf[js.Promise[
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
  ]]
  
  @scala.inline
  def httpRequest(options: typingsSlinky.parse.mod.global.Parse.Cloud.HTTPOptions): js.Promise[typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse] = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse]]
  
  @scala.inline
  def job(name: java.lang.String): typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse]
  @scala.inline
  def job(
    name: java.lang.String,
    func: js.Function1[
      /* request */ typingsSlinky.parse.mod.global.Parse.Cloud.JobRequest, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.parse.mod.global.Parse.Cloud.HttpResponse]
  
  @scala.inline
  def run(name: java.lang.String): js.Promise[_] = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[_]]
  @scala.inline
  def run(
    name: java.lang.String,
    data: js.UndefOr[scala.Nothing],
    options: typingsSlinky.parse.mod.global.Parse.Cloud.RunOptions
  ): js.Promise[_] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  @scala.inline
  def run(name: java.lang.String, data: typingsSlinky.parse.mod.global.Parse.Cloud.Params): js.Promise[_] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  @scala.inline
  def run(
    name: java.lang.String,
    data: typingsSlinky.parse.mod.global.Parse.Cloud.Params,
    options: typingsSlinky.parse.mod.global.Parse.Cloud.RunOptions
  ): js.Promise[_] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[_]]
  @scala.inline
  def run[T /* <: js.Function0[_] */](
    name: java.lang.String,
    data: scala.Null,
    options: typingsSlinky.parse.mod.global.Parse.Cloud.RunOptions
  ): js.Promise[typingsSlinky.std.ReturnType[T]] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.std.ReturnType[T]]]
  
  @scala.inline
  def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ typingsSlinky.parse.parseStrings.run with org.scalablytyped.runtime.TopLevel[typingsSlinky.std.Parameters[T]], 
    _
  ] */](
    name: java.lang.String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
  ): js.Promise[typingsSlinky.std.ReturnType[T]] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.std.ReturnType[T]]]
  @scala.inline
  def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ typingsSlinky.parse.parseStrings.run with org.scalablytyped.runtime.TopLevel[typingsSlinky.std.Parameters[T]], 
    _
  ] */](
    name: java.lang.String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any,
    options: typingsSlinky.parse.mod.global.Parse.Cloud.RunOptions
  ): js.Promise[typingsSlinky.std.ReturnType[T]] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.std.ReturnType[T]]]
  
  @scala.inline
  def run_T_Function0Wildcard[T /* <: js.Function0[_] */](name: java.lang.String): js.Promise[typingsSlinky.std.ReturnType[T]] = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.std.ReturnType[T]]]
  @scala.inline
  def run_T_Function0Wildcard[T /* <: js.Function0[_] */](
    name: java.lang.String,
    data: js.UndefOr[scala.Nothing],
    options: typingsSlinky.parse.mod.global.Parse.Cloud.RunOptions
  ): js.Promise[typingsSlinky.std.ReturnType[T]] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.std.ReturnType[T]]]
  
  /**
    * Starts a given cloud job, which will process asynchronously.
    * @param jobName The function name.
    * @param data The parameters to send to the cloud function.
    * @returns A promise that will be resolved with the jobStatusId of the job.
    */
  @scala.inline
  def startJob(jobName: java.lang.String, data: js.Any): js.Promise[java.lang.String] = (typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("startJob")(jobName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def useMasterKey(): scala.Unit = typingsSlinky.parse.mod.global.Parse.Cloud.^.asInstanceOf[js.Dynamic].applyDynamic("useMasterKey")().asInstanceOf[scala.Unit]
}
