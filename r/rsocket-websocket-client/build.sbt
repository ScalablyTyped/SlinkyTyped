organization := "org.scalablytyped.slinky"
name := "rsocket-websocket-client"
version := "0.0-dt-20191126Z-86c483"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20191126Z-f72fac",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20191126Z-a9a65b",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20191126Z-1e3ef3",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        