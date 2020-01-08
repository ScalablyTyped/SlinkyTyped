organization := "org.scalablytyped.slinky"
name := "pouchdb-adapter-fruitdown"
version := "6.1-dt-20190212Z-e2c6c1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-59e5de",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20191111Z-59eb26",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20190212Z-454ae2",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        