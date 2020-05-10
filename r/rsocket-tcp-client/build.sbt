organization := "org.scalablytyped.slinky"
name := "rsocket-tcp-client"
version := "0.0-dt-20191126Z-ddae12"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-c1ec72",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200404Z-92b614",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200225Z-8e2c66",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
