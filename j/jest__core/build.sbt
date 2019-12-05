organization := "org.scalablytyped.slinky"
name := "jest__core"
version := "24.9.0-73fe7f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-13b4ff",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-231f46",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-10f02e",
  "org.scalablytyped.slinky" %%% "jest-changed-files" % "24.9.0-cb24c2",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-e1c066",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-c3f322",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-5ce22c",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-a67250",
  "org.scalablytyped.slinky" %%% "jest-runner" % "24.9.0-0a54ca",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "24.9.0-20e5dc",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-e33197",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-1ef5b7",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-d8c77b",
  "org.scalablytyped.slinky" %%% "jest__reporters" % "24.9.0-ae91b6",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-22d410",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-668707",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-d63b3a",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20180214Z-0b44cd",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "yargs" % "13.0-dt-20191126Z-86e58c",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "13.1-dt-20190905Z-3625ad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        