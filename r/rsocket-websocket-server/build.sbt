organization := "org.scalablytyped.slinky"
name := "rsocket-websocket-server"
version := "0.0-dt-20200327Z-81d548"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-c1ec72",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200404Z-92b614",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200225Z-8e2c66",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-e5ad6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
